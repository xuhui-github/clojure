(defn count-down [x]
  (if (= x 0)
      (prn "finished")
      (count-down (do (prn x) (dec x)))
      )
  )

(count-down 10)

(defn count-down1 [x]
  (if (= x 0)
      (prn "Finished")
      (do (prn x) (count-down (dec x) ))
      )
  )

(count-down1 10 )


