my_list = ["José", "Lucas", "Nádia", "Fernanda", "Cairo", "Joana"]

def bigger_name(lst):
    big_name = ''
    for name in lst:
        if len(name) > len(big_name):
            big_name = name
    return big_name

print(bigger_name(my_list))