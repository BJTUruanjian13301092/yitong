I think this is a very interesting task and I have finished the core part of it

I build up a SpringBoot program and finished all my coding within it. The structure of my program is clear, there are 4 part:

1. util: Under util package, I write a util class named CsvReaderUtil. As far as I think, the function of reading csv file should be separated from other codes because it is a relatively independent part;
2. service: Under service package, this is the core function of this firewall. It combines my data models and the business logic of this task. It may looks quite simple, but it runs well under my data environment.
3. entity: Under entity package, this is one of the most important part of my whole task - the data structure of the firewall rules. In order to make the program efficient and reduce the time complexity. I build up a tree model of the firewall rules. Simply use a config file or a txt file for storage the rules is not proper and too time consuming. My tree model for both checking and add rules are efficient. The time complexity of add and searching one single rule without range is O(1). The size of the model is acceptable and runs very fast on my computer.
4. test: For the test part, I use Java unit test under SpringBoot framework. I built up a fw.csv for testing the input and add some of the firewall rules for checking the result. And the result is right under my test case. 

For this task, I use agile development strategy and develop my program iteratively. First I finished the reading csv part, then finished the firewall service part. After taking some time to think about the proper data structure for firewall rules, I finished the tree model. Now, my program can add or check a rule without range(it means no '-' for the input). Then I implemented adding a range of rules to the model. If I have more time, I can finished the final part of checking the input with a range of ports and ip addresses. It just need slightly changes to the Firewall service, the model remain the same.

I am very interested in the position provided by Illumio and I think the platform team is a very good fit for me. I have working experience and passion of building a back end system with high availability and strong api functions. That is what I do for Alibaba and SOHU.com. 

Besides that, the Data team is my second choice. I always like to jump out of my comfort zone and learn something new to me and face challenges. 