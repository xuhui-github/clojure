(def v (vec (range 1 65)))
(def m (map #(do (prn %1) (str %1 "!"))
            v
            )
  
  )

(first m)
(nth m 10)
(nth m 33)
(prn m)


