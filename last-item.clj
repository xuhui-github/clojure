(defn last-item [ls]
  (cond (nil? (next ls))
        (first ls)
        :else
        (last-item (next ls))
        )
  )
(last-item '(1 2 23))
(println (last-item '(1 2 33)))
