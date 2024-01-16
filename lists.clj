(def a (cons 10 (cons 20 (cons 30 nil))))
a
(cons 100 nil)

(def x (cons 1 (cons 2 nil)))
(def y (cons 10 x))
(def z (cons 5 y))
x
y
z
(cons 100 x)
x 
y

(def xx (list 2 4 6 8 10))
(count xx)
(reverse xx)
(list? xx)
(list? 45)

(filter odd? '(2 3 4 5 6))
(map inc xx)
(reduce + '(2 3 4 5))
(reduce * '(2 3 4 5))
(apply max xx)

(def ht {"Jenni" "867-5309" "Emergency" "911"})
(ht "Jenni")
(ht "Home")
(ht "Emergency")

(def t {[1 2] "hi"})
t
(t [1 2])
(def np {:p1 {:x 1 :y 2} :p2 {:x 5 :y 7}})
np
((np :p1) :x)
(:y (np :p1))
(-> np :p2 
    :x)
(keys np)
(vals np)
np
(+ (:y (:p1 x)) 10)
np
(assoc (:p1 np) :x 1000)
np
(def h {:name 'hui' :age 23})
h
(assoc h :name 'Unknown')
h

