(def a (agent 0))

(def h [a e]
  (prn "Agent value: " @a)
  (prn "Agent error: " e)
  (future (restart-agent a 0))
  )

(set-error-handler! a h)
(send a inc)
(send a #(/ % 0))
(send a inc)

