defn foo [p]
  (prn 
    (str "Hello " p "!")
    )
  )

(foo 'xuhui')

(def foo1
  (fn [p]
      (prn
        (str "Hello" p "!")
        )
      )
  )
(foo1 'xuhui')

