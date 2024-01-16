(def ls
  (lazy-seq
    (do 
        (prn "body executed")
        (lazy-seq (do (prn "next body executed") [:a :b :c]))
        )
    )
  )

ls
(take 1 ls)
