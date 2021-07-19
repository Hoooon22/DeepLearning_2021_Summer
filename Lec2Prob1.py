corpus = 'Today is monday'

trainX=[]
trainY=[]

window_size=3
for i in range(len(corpus) - window_size):
    x=[]
    for j in range(i, i+window_size):
        x.append(corpus[j])
    trainX.append(x)
    trainY.append(corpus[i+window_size])

for i in range(len(trainX)):
    print(trainX[i], end=' ')
    print(trainY[i])