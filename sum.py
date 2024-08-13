def find_second_occurrence(lst, number):
    count = 0
    for index, value in enumerate(lst):
        if value == number:
            count += 1
            if count == 2:
                return index
    return -1

nums = [2,7,11,15]
#nums = [3,3] and target is 6 : tricky
print(nums)
rtype=[]
print(rtype)
temp={}
item1=sum(nums)
item2=sum(nums)
target=9
for i in nums:
    if target-i in temp:
        print('inside if')
        item1=i
        item2=target-i
    else:
        temp[i] = target-i
        

print(item1)
print(item2)
rtype.append(nums.index(item1))
if(item1 == item2):
    rtype.append(find_second_occurrence(nums,item2))
else:
    rtype.append(nums.index(item2))
rtype.sort()
print(rtype)

        

        

