(defn howmany [col]

  (cond (nil? col)
        0
        :else
        (+ 1 (howmany (next col)))
        )
  )
(def n  (howmany '(1 2 3)))
(println n)

