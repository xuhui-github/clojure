(defn add-n [n, coll]
  (lazy-seq 
    (cons (+ n (first coll)) (add-n n (rest coll)))
    )
  )

(type (add-n 100 (range)))
(take 10 (add-n 10 (range)))
