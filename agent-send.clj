(def a (agent 0))

(send a #(do (Thread/sleep 10000) (prn "added 5") (+ % 5)))
(send a #(do (Thread/sleep 10000) (prn "added 2") (+ % 2)))
(await-for 3000 a) ;await for specifi time
(prn @a)
(await a) ;we block until the action are c`omplete and deference the agent 
(prn @a)

(def a (agent 0))

(defn h [a e]
  (prn "Agent value: " @a)
  (prn "Agent error: " e)
  )

(set-error-handler! a h)
(send a #(/ % 0))

