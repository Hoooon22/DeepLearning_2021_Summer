corpus="The moon revolves around the sun the moon revolves around the earth";
corpus=corpus.lower()

#create list variable of unique words from the corpus.
#and map each word to unique integers
word2IdxMap={w:i for i,w in enumerate(sorted(list({word for word in corpus.split()})))} 
print('====mapping result====')
for key in word2IdxMap:
    print('%s: %d'%(key,word2IdxMap[key]))