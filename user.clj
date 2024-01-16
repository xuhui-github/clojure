(defn fee-amount [percentage user]
  (with-precision 16 :rounding HALF_EVEN
    (* 0.01 percentage (:salary user))))
(def user-1 {:login "rob" :referrer "mint.com" :salary 100000 :rating :rating/bronze})
(def user-2 {:login "gordon" :referrer "mint.com" :salary 80000 :rating :rating/silver})
(def user-3 {:login "kyle" :referrer "google.com" :salary 90000 :rating :rate/gole})
(def user-4 {:login "celeste" :referrer "yahoo.com" :salary 70000 :rating :rating/platinum})

(defn fee-category [user]
  [(:referrer user) (:rating user)])

(map fee-category [user-1 user-2 user-3 user-4])

(defmulti profit-base-affiliate-fee fee-category)

(defmulti profit-based-affiliate-fee fee-category)
(defmethod profit-based-affiliate-fee ["mint.com" :rating/bronze]
  [user] (fee-amount -0.03M user))
(defmethod profit-based-affiliate-fee ["mint.com" :rating/silver]
  [user] (fee-amount 0.04M user))
(defmethod profit-based-affiliate-fee ["mint.com" :rating/gold]
  [user] (fee-amount 0.05M user))
(defmethod profit-based-affiliate-fee ["mint.com" :rating/platinum]
  [user] (fee-amount 0.05M user))
(defmethod profit-based-affiliate-fee ["google.com" :rating/gold]
  [user] (fee-amount 0.03M user))
(defmethod profit-based-affiliate-fee ["google.com" :rating/platinum] 
  [user] (fee-amount 0.03M user))
(defmethod profit-based-affiliate-fee :default
  [user] (fee-amount 0.02M user))

(map profit-based-affiliate-fee [user-1 user-2 user-3 user-4])
