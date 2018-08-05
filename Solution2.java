static long calcTime(int[] tickets, int p) {
        long nLoops = 0;
        int InProgress = 0;
        int WaitingQueue = tickets.length;
        if(numberOfParticipantsInLine > p)
        {
            while(tickets[p] != 0)
            {
                // The person has already got his ticket and exited the line, just go to the next person, dont increase number of iterations because it took no time
                if(tickets[InProgress] != 0)
                {
                    // ticket being processed got one ticket
                    tickets[InProgress] = tickets[InProgress] -1;
                    // if we have reached the end of the line
                    if(InProgress == WaitingQueue - 1)
                        InProgress = 0;
                    else
                        InProgress ++;
                    nLoops ++;
                }
                else {
                    if (InProgress == WaitingQueue - 1)
                        InProgress = 0;
                    else
                        InProgress++;
                }
                Log.d("Values",printArray(tickets));
            }
        }
        return nLoops;
    }