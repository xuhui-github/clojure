(def foo (atom []))

(future 
  (locking foo
           (Thread/sleep 1000)
           (swap! foo #(conj % 1))
           )
  )

(locking foo
         (swap! foo #(conj % 2))
         )
@foo
