import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-write-relative-xpath-for-windows-desktop-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-write-relative-xpath-for-windows-desktop-apps/41791/2')

'step 2: At Page_t_how-can-i-write-relative-xpath-for-windows-desktop-2 click on hyperlink_europe1_discourse_cdn_com_katalon_origi'

testObj = findTestObject('Object Repository/Page_t_how-can-i-write-relative-xpath-for-windows-desktop-apps/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-can-i-write-relative-xpath-for-windows-desktop-apps/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_how-can-i-write-relative-xpath-for-windows-desktop-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00029_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
