



(defn max3 [a b c]
  (cond (and (> a b) (> a c)) a
        (and (> b a) (> b c)) b
        :else c )
  
  )
(max 20 10 80)

(defn my-compare [a b]
  (cond (= a b) 'equal'
        (< a b) 'less'
        :else 'greater')
  )
(my-compare 10 10)
(my-compare 10 1)
(my-compare 10 31)

(defrecord Foo  [x y z])
(def f (Foo. 10 20 30))
(:x f)
(:y f)
(:z f)
