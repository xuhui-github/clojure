;; Connected to nREPL server - nrepl://localhost:35739
;; CIDER 1.11.0 (Hvar), nREPL 1.0.0
;; Clojure 1.11.1, Java 17.0.10
;;     Docs: (doc function-name)
;;           (find-doc part-of-name)
;;   Source: (source function-name)
;;  Javadoc: (javadoc java-object-or-class)
;;     Exit: <C-c C-q>
;;  Results: Stored in vars *1, *2, *3, an exception in *e;
;;  Startup: /usr/local/bin/clojure -Sdeps \{\:deps\ \{nrepl/nrepl\ \{\:mvn/version\ \"1.0.0\"\}\ cider/cider-nrepl\ \{\:mvn/version\ \"0.43.1\"\}\}\ \:aliases\ \{\:cider/nrepl\ \{\:main-opts\ \[\"-m\"\ \"nrepl.cmdline\"\ \"--middleware\"\ \"\[cider.nrepl/cider-middleware\]\"\]\}\}\} -M:cider/nrepl
user> (def votes-am {:vanilla 3 :chocolate 5})
#'user/votes-am
user> (def votes-pm {:vanilla 4 :neapoliton 2})
#'user/votes-pm
user> (merge votes-am votes-pm)
{:vanilla 4, :chocolate 5, :neapoliton 2}
user> (def Alice {:loves #{:clojure :lisp :scheme} :hates #{:fotran :c :c++}})
#'user/Alice
user> Alice
{:loves #{:lisp :clojure :scheme}, :hates #{:fotran :c :c++}}
user> (def Bob {:loves #{:clojure :scheme} :hates #{:c :c++ :algol}})
#'user/Bob
user> (sort #(< (count %1) (count %2)) ["z" "yy" "zzz" "a" "bb" "ccc"])
("z" "a" "yy" "bb" "zzz" "ccc")
user> (set 'first 'first)
Execution error (ArityException) at user/eval9598 (REPL:25).
Wrong number of args (2) passed to: clojure.core/set
user> (set [ 'first 'first])
#{first}
user> (rand-int 3)
1
user> (array-map)
{}
user> (sorted-map :name "hui" :age 23 :addr "renqiu")
{:addr "renqiu", :age 23, :name "hui"}
user> (sorted-map-by #(< (count %1) (count %2))
                     "pigs" 14
                     "horses" 2
                     "elephants" 1
                     "manatees" 3)
{"pigs" 14, "horses" 2, "manatees" 3, "elephants" 1}
user> (def website {:clojure-cookbook {:hits 1236}})
#'user/website
user> (update-in website
                 [:clojure-cookbook :hits]
                 +
                 101)
{:clojure-cookbook {:hits 1337}}
user> (update-in {} [:author :residence] assoc :country "USA")
{:author {:residence {:country "USA"}}}
user> (def retail-date (atom {:customers [{:id 123 :name "Luke"}
                                          {:id 321 :name "Ryan"}]
                              :orders [{:sku "Q2M9" :customer 123 :qty 4}
                                       {:sku "43XP" :customer 321 :qty 1}]}))










#'user/retail-date
user> retail-date
#<Atom@69c345a8: 
  {:customers [{:id 123, :name "Luke"} {:id 321, :name "Ryan"}],
   :orders
   [{:sku "Q2M9", :customer 123, :qty 4}
    {:sku "43XP", :customer 321, :qty 1}]}>
user> (swap! retail-date update-in [:orders] 
             conj {:sku "9QED" :customer 321 :qty 2})










{:customers [{:id 123, :name "Luke"} {:id 321, :name "Ryan"}],
 :orders
 [{:sku "Q2M9", :customer 123, :qty 4}
  {:sku "43XP", :customer 321, :qty 1}
  {:sku "9QED", :customer 321, :qty 2}]}
user> retail-date
#<Atom@69c345a8: 
  {:customers [{:id 123, :name "Luke"} {:id 321, :name "Ryan"}],
   :orders
   [{:sku "Q2M9", :customer 123, :qty 4}
    {:sku "43XP", :customer 321, :qty 1}
    {:sku "9QED", :customer 321, :qty 2}]}>
user> (def chessboard {[:a 5] [:white :king]
                       [:a 4] [:white :pawn]
                       [:d 4] [:black :king]
                       })
#'user/chessboard
user> chessboard
{[:a 5] [:white :king], [:a 4] [:white :pawn], [:d 4] [:black :king]}
user> (defn move [board source dest]
        (->board
         (dissoc source)
         (assoc dest (board source))))
Syntax error compiling at (*cider-repl ~:localhost:35739(clj)*:104:9).
Unable to resolve symbol: ->board in this context
user> (print)
nil
user> (print "heLLO")
