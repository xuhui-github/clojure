(defn reverselist [coll]
      (if (empty? coll)
         ()
         (cons (first coll)(reverse (reverselist (rest coll)))))
   )



(reverselist '(1 2 3 4))

(defn reversevec [coll]
  (if (empty? coll)
      ()
      ;;(conj (reversevec (rest coll) (vec (first coll))))
      (conj (reversevec (rest coll)) (vec (first coll)))
      )
  )

(prn (reversevec [1 2 3 4]))
