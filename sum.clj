(defn sum [coll]
  (if (empty? coll)
      0
      (+ (first coll) (sum (rest coll)))
      )
  )

(prn (sum '(1 2 3 4)))
