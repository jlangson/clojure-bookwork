;You need to develop an encode function and a decode function.
;The encode function should replace letters with numbers that are not easily guessable. For that purpose, each letter will take the character's number value in the ASCII table, add another number to it (the number of words in the sentence to encode), and finally, compute the square value of that number. 
;The decode function should allow the user to revert to the original string. 

(defn encode [s]
  "Converts a string to a number by:
  Swap each char with ASCII table
  Add the number of words in the sentence
  Calculate the square of the number of words in the sentence"
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\w" (fn [s] (encode-letter s number-of-words)))))


;;their version
(defn encode-letter
  [s x]
  (let [code (Math/pow (+ x (int (first (char-array s)))) 2)]
    (str "#" (int code))))


(defn encode
  [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\w" (fn [s] (encode-letter s number-of-words)))))


(defn decode-letter
  "Square root the letter
  Subtract number of words
  Convert from ASCII (string) to a letter"
  [coded-letter number-of-words]
  (char (- (int (Math/sqrt coded-letter)) number-of-words)))


(defn decode
  [s]
  (let [number-of-words (- (count (clojure.string/split s #"#") 1)]
  (clojure.string/replace s ??? (fn [s] decode-letter s number-of-words)))))


;their version
(defn decode-letter
  [x y]
  (let [number (Integer/parseInt (subs x 1))
        letter (char (- (Math/sqrt number) y))]
  (str letter)))


(defn decode [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\#\d+" (fn [s] (decode-letter s number-of-words)))))
