(defmulti home :os)
(defmethod home ::unix [m] (get m :home))


(home unix)
