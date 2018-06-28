#! python3
import openpyxl

wb = openpyxl.load_workbook('censuspopdata.xlsx')
sheet =  wb['Population by Census Tract']

for rowNum in range(2,sheet.max_row+1):
    state = sheet['B' + str(rowNum)].value
    county = sheet['C' + str(rowNum)].value
    pop = sheet['D' + str(rowNum)].value
    print(state,county,pop)