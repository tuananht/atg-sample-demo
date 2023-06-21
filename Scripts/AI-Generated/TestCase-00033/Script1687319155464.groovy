import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-am-not-able-create-the-new-project-when-i-select-the-file-new-there-is-no-option-new-project'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-am-not-able-create-the-new-project-when-i-select-the-file-new-there-is-no-option-new-project/79583')

'step 2: Add visual checkpoint at Page_t_i-am-not-able-create-the-new-project-when-i-select-the-file-new-there-is-no-option-new-project'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00033_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
