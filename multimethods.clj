(defmulti encounter
  (fn dispatch [ x y]
      [(:species x) (:species y)]
      )
  )

(defmethod encounter [:bunny :lion] [ x y] :run-away)
(defmethod encounter [:lion :bunny] [x y] :eat)
(defmethod encounter [:lion :lion] [x y] :fight)
(defmethod encounter [:bunny :bunny] [x y] :mate)

;These are somewhere between a case statement and a function definition.They
;give the conditions under which to be called,and a function definition.give
;a dispatch result of [:bunny :lion],the first method here does nothing but
;return a value :run-away.Let's set up some test input:

(def bunny1 {:species :bunny :other :stuff})
(def bunny2 {:species :bunny :other :stuff})
(def lion1 {:species :lion :other :stuff})
(def lion2 {:species :lion :other :stuff})

;now we can call encounter on the data to see what it does...

(encounter bunny1 bunny2)
(encounter bunny1 lion1)
(encounter lion1 bunny1)
(encounter lion1 lion2)

;Because keywords are functions,it's quite common to use a keyword as a 
;dispatch function
(defmulti draw :sharp)
