def canonical(word)
    word_arr = word.downcase.split('')
end



def detect_anagram(word1, word2)
  canonical(word1) == canonical(word2)
end