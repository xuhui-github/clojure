(def r (ref 0))

(dosync 
  (alter r inc)
  )
@r

(dosync 
  (ref-set r 100)
  )

(def r (ref []))

(defn modify [r,f,a,s]
  (dosync
    (Thread/sleep s)
    
    )
  )

(defn sum [coll]
  (if (empty? coll)
      0
      (+ (first coll) (sum (rest coll)))
      )
  )

(prn (sum '(1 2 3 4)))
