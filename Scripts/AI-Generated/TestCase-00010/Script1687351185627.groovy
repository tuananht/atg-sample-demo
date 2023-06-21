import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_end-to-end-e2e-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/end-to-end-e2e-testing')

'step 2: At Page_resources-center_blog_end-to-end-e2e-testing click on hyperlink_h6 --> navigate to Page_resources-center_blog_end-to-end-e2e-testing#h6'

testObj = findTestObject('Object Repository/Page_resources-center_blog/hyperlink_object_11')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/resources-center/blog/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_resources-center_blog_end-to-end-e2e-testing#h6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00010_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
