import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_mksrqa_badges'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/mksrqa/badges')

'step 2: At Page_u_mksrqa_badges click on hyperlink_editor --> navigate to Page_editor'

testObj = findTestObject('Object Repository/Page_u_mksrqa_badges/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/u/mksrqa/badges(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_editor'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00049_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
