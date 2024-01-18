#! python3
import openpyxl

wb = openpyxl.load_workbook('censuspopdata.xlsx')
sheet =  wb['Population by Census Tract']

countyData  ={}
for rowNum in range(2,sheet.max_row+1):
    state = sheet['B' + str(rowNum)].value
    county = sheet['C' + str(rowNum)].value
    pop = sheet['D' + str(rowNum)].value
    print(state,county,pop)

    # Make sure the key for this state exists.
    countyData.setdefault(state, {})
    # Make sure the key for this county in this state exists.
    countyData[state].setdefault(county, {'tracts': 0, 'pop': 0})
    # Each row represents one census tract, so increment by one.
    countyData[state][county]['tracts'] += 1
    # Increase the county pop by the pop in this census tract.
    countyData[state][county]['pop'] += int(pop)

print(countyData)