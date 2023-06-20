import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-run-multiple-feature-files-in-a-specific-sequence-using-cucumber-runner-class'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-run-multiple-feature-files-in-a-specific-sequence-using-cucumber-runner-class/24327')

'step 2: Add visual checkpoint at Page_t_how-to-run-multiple-feature-files-in-a-specific-sequence-using-cucumber-runner-class'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00255_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
