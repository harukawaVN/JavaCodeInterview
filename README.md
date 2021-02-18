# JavaCodeInterview
Question1
Datadog has it's own query language and grammar, and supports templated variables in monitors descriptions for instance. We'd like to write a generic is_balanced function that would tell if a given string is balanced. We only want to support ( and ) for now. Parenthesis could be nested.

def is_balanced(word):
    pass

print is_balanced('Warning: load is high on (host.ip)'), True
print is_balanced('((hello)(world))'), True
print is_balanced('my (monitor))(message'), False
Question2
You're given a list of four digit numbers: [3592, 2974, 1796, 2983, ...]. Given two numbers in the list, write a function that finds whether there is a "number chain" between those two numbers consisting of elements in the list. A "number chain" is a sequence of numbers where the last two digits of sequence member n are equal to the first two digits of member n + 1. E.g.:

9462, 6283, 8391, 9166, 6634, 3457

would be a valid “number chain” between 9462 and 3457.

Question3: Run-Length Encoding
Write a function that, given a list of numbers, returns a run-length encoded representation of the list. Run-length encoding is a very simple form of data compression in which runs of data (that is, sequences in which the same data value occurs in many consecutive data elements) are stored as a single data value and count, rather than as the original run.

Example: [1, 1, 1, 1, 5, 2, 2, 2, 3, 3, 1]. Run-length encoded: [4, 1, 1, 5, 3, 2, 2, 3, 1, 1].

Question4: Simplified Tags Counts
We have a stream of tags (e.g. 'host:c', 'role:db', 'region:us') that we receive from our
customers and we want to build a page to summarize the tags they send.

Write a function that takes this list of tags as input returns a data structure that contains
the count of each tag.

stream = [
    'host:a,role:web,availability-zone:us-east-1a',
    'host:b,role:web,availability-zone:us-east-1b',
    'host:a,role:web,availability-zone:us-east-1a',
    'host:c,role:db,db_role:master,availability-zone:us-east-1e',
    'host:d,role:db,db_role:replica,availability-zone:us-east-1a',
    'host:e,role:intake,availability-zone:us-east-1a',
    'host:e,role:intake,availability-zone:us-east-1a',
    'host:f,role:kafka,availability-zone:us-east-1a'
]

// Example output

{
    'availability-zone:us-east-1a': 6,
    'db_role:master': 1,
    'availability-zone:us-east-1b': 1,
    'host:d': 1,
    'role:db': 2,
    'host:b': 1,
    'host:c': 1,
    'host:a': 2,
    'role:web': 3,
    'host:f': 1,
    'role:kafka': 1,
    'host:e': 2,
    'availability-zone:us-east-1e': 1,
    'db_role:replica': 1,
    'role:intake': 2
}
Question5: Total Job Time
Given an array describing jobs in a build system and a job ID, determine the total time required to complete this job.

jobs = [
    # job_id, job_time, child_job_ids
[1, 30, [2, 4]],
    [2, 10, [3]],
    [4, 60, []],
    [3, 20, []],
]    

find_total_job_time(jobs, 1) # 30 + (10+20) + 60 = 120
find_total_job_time(jobs, 2) # 10 + 20 = 30
find_total_job_time(jobs, 4) # 60
