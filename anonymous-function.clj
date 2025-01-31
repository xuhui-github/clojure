(fn [ x y]
  (println "Making a set")
  #{x y})


((fn [ x y ]
   (println "Making a set")
   #{ x y}) 1 3)


(def make-set
  (fn [ x y ]
    (println "Making a set")
    #{ x y}))

(make-set 1 22)

(def a 23)
(println a)

(defn make-a-set
  "Takes two values and makes a set from them."
  [ x y ]
  (println "Making a set")
  #{ x y})

(make-a-set 100 200)



;;Functions with mutiple arties
(defn make-set-2
  ([x] #{x})
  ([x y] #{ x y})
  ;;  ([x y & more ] #{x y more})
  ([x y & more] (set (cons x (cons y more))))
   )
  
(make-set-2 1 2 3 4  5 6 7 8)


(defn arity2+ [first second & more]
  (vector first second more))
(arity2+ 1 2)
(arity2+ 1 3 4 56)

;;In-place functions with #()
;;Clojure provide a shorthand notation for creating an anonymous function
;;using the #() reader feature.
;;In the case of the #() form,it's effectively replaced with the special
;;form fn
;;The #() form can also accept arguments that are implicitly declared through
;;the use of special symbols prefixed with %:

(def make-list0 #(list))
(make-list0)

(def make-list01 #(list %1 %2))
(make-list01 22 44)

(def make-list02+ #(list %1 %2 %&))
(make-list02+ 1 2 3 4 5)

(def make-list03 #(cons %1 (cons %2 %&)))
(make-list03 1 2 3 4 5 6 7 8 9)


(defn 
