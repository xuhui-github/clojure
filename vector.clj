(def a [10 20 30])
(a 0)
(a 1)
(a 2)
(count a)

(def pt {:x 10 :y 20})
(pt :x)
(pt :y)
(:y pt)
;update a hash map,we have a function assoc.
(assoc pt :z 30)
(assoc pt :x 123)

