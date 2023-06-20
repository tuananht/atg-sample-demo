import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-select-the-checkboxes-when-there-are-set-of-both-enable-and-disabled-checkboxes'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-select-the-checkboxes-when-there-are-set-of-both-enable-and-disabled-checkboxes/21325')

'step 2: Add visual checkpoint at Page_t_how-to-select-the-checkboxes-when-there-are-set-of-both-enable-and-disabled-checkboxes'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00618_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
