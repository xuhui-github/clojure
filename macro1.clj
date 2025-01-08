(def a 150)
(my-if (> a 200)
       (println "Bigger than 200")
       (println "Smaller than 2000")
       )

(defn my-if [cond positive negative]
  (if cond
    positive
    negative
    )
  )


