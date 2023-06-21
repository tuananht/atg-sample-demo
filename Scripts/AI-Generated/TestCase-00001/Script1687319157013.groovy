import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_collect-the-list-of-webelements'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/collect-the-list-of-webelements/33275')

'step 2: At Page_t_collect-the-list-of-webelements click on p_object'

testObj = findTestObject('Object Repository/Page_t_collect-the-list-of-webelements/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/collect-the-list-of-webelements/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_collect-the-list-of-webelements click on p_object'

testObj = findTestObject('Object Repository/Page_t_collect-the-list-of-webelements/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/collect-the-list-of-webelements/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_t_collect-the-list-of-webelements click on p_object'

testObj = findTestObject('Object Repository/Page_t_collect-the-list-of-webelements/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/collect-the-list-of-webelements/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_collect-the-list-of-webelements'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
