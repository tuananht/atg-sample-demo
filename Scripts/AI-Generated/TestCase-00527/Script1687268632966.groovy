import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-no-such-frame-element-is-not-a-frame-when-switching-to-an-14'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-no-such-frame-element-is-not-a-frame-when-switching-to-an-iframe/13020/14')

'step 2: Add visual checkpoint at Page_t_error-no-such-frame-element-is-not-a-frame-when-switching-to-an-14'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00527_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
