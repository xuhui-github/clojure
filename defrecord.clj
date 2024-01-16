(deftype Circle [radius])
(deftype Square [length width])
(Circle. 10)
(Square. 5 10)

(->Circle 10)
(->Square 5 11)

(import java.net.FilenameMap)
(defrecord Thing [a]
  FilenameMap
  (getContentTypeFor [this filename] (str a "-" filename))
  
  )

(def Thind (Thing. "foo"))
(instance? FileNameMap thing)
(.getContentTypeFor thing "bar")

