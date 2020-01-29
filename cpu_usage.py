#!/usr/bin/env python3
import psutil

def check_cup_usage(percent):
    usage = psutil.cpu_percent()
    print("usage :{}".format(usage))
    return usage < percent

if not check_cup_usage(75):
    print("Overloaded CUP -- attention required")
else:
    print("everything is OK")
