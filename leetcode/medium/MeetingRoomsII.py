def minRooms(self, meetings: List[List[int]]) -> int:
    intervals = {}

    for meeting in meetings:
        for i in range(meeting[0], meeting[1]):
            if i in intervals:
                intervals[i] += 1
            else:
                intervals[i] = 1
    rooms = 0

    for i in intervals.values():
        if i > rooms:
            rooms = i
    
    return rooms
