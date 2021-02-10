import java.util.stream.Stream;

public class Question5 {
    static class Job{
        int jobId;
        int jobTime;
        int[] childJobId;

        Job (int jobId, int jobTime, int[] childJobId){
            this.jobId = jobId;
            this.jobTime = jobTime;
            this.childJobId = childJobId;
        }
    }

    static public int findTotalJobTime(int jobId, Job[] jobs){
        Job job = Stream.of(jobs).filter(t -> t.jobId == jobId).findFirst().orElse(null);
        if (job != null){
            int sumTime = job.jobTime;
            if (job.childJobId.length == 0){
                return sumTime;
            }
            for (int subJobId : job.childJobId){
                sumTime += findTotalJobTime(subJobId,jobs);
            }
            return sumTime;
        }
        return 0;
    }
}
