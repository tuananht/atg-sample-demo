import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome/59766')

'step 2: At Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome click on p_object'

testObj = findTestObject('Object Repository/Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome/p_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
