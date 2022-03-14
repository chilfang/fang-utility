import pygame
import time

class ScreenPack:
    clock = pygame.time.Clock()
    fps = 30
    storedTime = time.time() * 1000
    clock.tick(fps)

    def __init__(self, displayWidth, displayHeight):
        self.displayWidth = displayWidth
        self.displayHeight = displayHeight
        self.screen = pygame.display.set_mode([displayWidth, displayHeight])

    def getScreen(self):
        return self.screen

    def setDisplayWidth(self, displayWidth):
        self.displayWidth = displayWidth
        self.screen = pygame.display.set_mode([displayWidth, self.displayHeight])
    def getDisplayWidth(self):
        return self.displayWidth

    def setDisplayWidth(self, displayHeight):
        self.displayWidth = displayHeight
        self.screen = pygame.display.set_mode([self.displayWidth, displayHeight])
    def getDisplayHeight(self):
        return self.displayHeight


    def setFPS(self, inp):
        self.fps = inp
    def getFPS(self):
        return self.clock.get_fps()


    def frameReadyCheck(self):
        newTime = time.time() * 1000
        if newTime >= self.storedTime + (1000 / self.fps):
            self.storedTime = newTime
            return True
        else:
            time.sleep((newTime - self.storedTime) / 1000)

    def setBackground(self, color):
        self.screen.fill(color)

