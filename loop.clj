(loop [i 10]
      (if (= i 0)
          (prn "finished")
          (recur (do (prn i) (dec i)))
          )
      )


