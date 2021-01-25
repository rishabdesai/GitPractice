import cx_Oracle

try:
    con = cx_Oracle.connect('root/root@localhost')
    cursor=con.cursor()
    cursor.execute("select * from emp2")
    myresult = cursor.fetchall()

    for x in myresult:
        print(x)

except cx_Oracle.DatabaseError as e:
    print("connection issue")

finally:
    if cursor:
        cursor.close()
    if con:
        con.close()
