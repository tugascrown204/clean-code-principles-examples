def calculate_area(radius):
    import math
    if radius < 0:
        raise ValueError('Radius cannot be negative')
    return math.pi * (radius ** 2)

if __name__ == '__main__':
    try:
        area = calculate_area(5)
        print(f'Area: {area}')
    except ValueError as e:
        print(e)
