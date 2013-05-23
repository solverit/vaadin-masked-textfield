Masked TextField for Vaadin 7
=========================================

Overview of currently available masks:

# - any digit
U - upper-case letter
L - lower-case letter
? - any letter
A - any number or character
* - anything
H - hex sign (0-9, a-f or A-F)
' - Escape character, used to escape any of the special formatting characters.
~ - +/- sign

Any character not matching one of the above mask character or if it escaped with the single quote character (') is considered to be a literal.

Some mask examples:

Phone Number: (###) ###-####
USPS Express Mail: EU#########'US
Date / time: ##/##/#### ##:##
State: UU
HTML Color: '#HHHHHH
An capitalized 6 letter word: ULLLLL