import textwrap


def wrap(string, max_width):
    text = textwrap.fill(string, max_width)
    return text
