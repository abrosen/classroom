import openpyxl

wb = openpyxl.load_workbook("foo.xslx")

sheet = wb['Sheet1']

output = []
for i in range(1, sheet.max_row+1):
    cell = sheet['B'+str(i)]
    date = cell.value
    if date == "01/01" or date == "12/31":
        output.append(sheet["A"+str(i)].value)
