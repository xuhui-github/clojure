(vector? (do
           (def x 2) ;;local variable x
           (def y 20) ;;local variable y
           (+ x y)
           [ x y ]))

(let [ r 5
      pi 3.1415
      r-squared (* r r)]
  (println "radiux is" r)
  (* pi r-squared))


;;Recur
;;Clojure has a special form called recur that's specifically for tail recursion.
;;The following function prints  the integers from x to 1,counting backward:

(defn print-down-from [x]
  (when (pos? x)
    (println x)
    (recur (dec x))))

(print-down-from 10)


(defn sum-down-from-1 [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))

(sum-down-from-1 0 10)



(defn sum-down-from [ initial-x ]
  (loop [ sum 0, x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))
      sum)))

(sum-down-from 100)



;;TAIL POSITION
;;Now that we’ve looked at a couple of examples of how to use recur , we must discuss
;;an important restriction. The recur form can only appear in the tail position of a
;;function or loop . What’s a tail position? Succinctly, a form is in a tail positio;;n of an
;;expression when its value may be the return value of the entire expression. Consider
;;this function:

(defn absolute-value [x]
  (if (pos? x)
    x
    (- x)))

;;(fn [x] (recur x) (println x))

(cons 1 nil)
1
[2 3]

(quote age)
(def age 9)
(quote age)
;; The quote special operator prevents its argument from being evaluated
;;at all.
;;Although the symbos age by itself
;;might evaluate to the value of a var,when it's inside quote form,it isn't


(quote (cons 1 [ 2 3]))

;;(cons 1 (2 3))
;; class java.lang.Long cannot be cast to class clojure.lang.IFn
;; (java.lang.Long is in module java.base of loader 'bootstrap';
;; clojure.lang.IFn is in unnamed module of loader 'app')

;;That's Clojure telling you that an integer (the number 2 here)can't be used as a
;;function.You have to prevent the form (2 3) from being treated like a function
;;call-which is exactly what quote is for:

;;(cons 1 (quote (2 3)))
;;this is used less in Clojure.it's still provided.
;;The previous example can also be written as follows:

(cons 1 '(2 4))

[1 (+ 2 3)]
'(1 (+ 2 3))

;;Syntax-quote
;;Like quote,the syntax-quote prevents its argument and subforms from being evaluated.Unlike quote,it has a few extra featur that make it ideal for constructing col-lections be used as code.
;;Syntax-quote is written as a single back-quote (`):

`(1 2 3)
`(1 (+ 1 2) (+ 2 4))
;;(1 (clojure.core/+ 1 2) (clojure.core/+ 2 4))

;;It doesn't expand to a simple form like quote, but to whatever set of expressions is
;;required to support the following features.

`map ;;=>clojure.core/map

;;clojure.core/map
;;clojure.set/union
;;i.just.make.this.up/quux

;;Syntax-quote automatically qualifies all unqualified symbols in its argument:
`map

;; =>clojure.core/map

`Integer

;; =>java.lang.Integer

`(map even? [1 2 3 4])
;; => (clojure.core/map clojure.core/even? [ 1 2 3 4])

;;If the symboal doesn't name a var or class that exists yes,syntax-quote uses the current namespace:
`is-always-right
;; =>user/is-always-right

;;This behavior will come in handy in chapter 8,when we discuss macros.


`(+ 10 (* 3 2)) ;;=>(clojure.core/+ 10 (clojure.core/* 3 2))
`(+ 10 ~(* 3 2));;=>(clojure.core/+ 10 6)
;;An unquote is used demarcate specific forms as requiring evaluation by prefixing them with the symbol ~ within the body of a syntax-quote:
;;The unquote is used to denote any Clojure expression as requiring evaluation:

(let [ x 2]
  `(1 ~x 3)) ;;=>(1 2 3)

;;`(1 ~(2 3))
;;Unhandled java.lang.ClassCastException
;;class java.lang.Long cannot be cast to class clojure.lang.IFn

(let [ x '(2 3)] `(1 ~x))
;;=>(1 (2 3))

(let [x '(2 3)] `(1 ~@x));;=>(1 2 3)



`potion#









