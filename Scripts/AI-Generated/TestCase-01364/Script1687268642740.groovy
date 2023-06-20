import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_need-to-pass-different-data-when-calling-a-test-case-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/need-to-pass-different-data-when-calling-a-test-case-twice/20722/2')

'step 2: Add visual checkpoint at Page_t_need-to-pass-different-data-when-calling-a-test-case-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01364_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
