def designerPdfViewer(h, word):
    area = 0
    max_h = 0
    for c in word:
        if h[ord(c) - 97] > max_h:
            max_h = h[ord(c) - 97]
    area = len(word) * max_h
    return area
